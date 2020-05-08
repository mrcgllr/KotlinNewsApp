package com.example.kotlinnewsapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kotlinnewsapp.R
import com.example.kotlinnewsapp.model.Article
import kotlinx.android.synthetic.main.item_article_preview.view.*


class NewsAdapter(private val onItemClickListener:(Article)->Unit) : RecyclerView.Adapter<NewsAdapter.ArticleViewHolder>() {

    inner class ArticleViewHolder(container: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(container.context)
            .inflate(
                R.layout.item_article_preview,
                container,
                false
            )
    ) {

        fun bind(article:Article,onItemClickListener: (Article) -> Unit){
            itemView.apply {
                    Glide.with(itemView.context)
                        .load(article.urlToImage)
                        .into(itemView.ivArticleImage)

                tvSource.text=article.source?.name
                tvTitle.text=article.title
                tvDescription.text=article.description
                tvPublishedAt.text = article.publishedAt
            }

            itemView.setOnClickListener {
                onItemClickListener(article)
            }

        }
    }


    private val diffCallback = object : DiffUtil.ItemCallback<Article>() {
        override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
            return oldItem.url == newItem.url
        }

        override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
            return oldItem == newItem
        }
    }
    val differ = AsyncListDiffer(this, diffCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder =
        ArticleViewHolder(parent)

    override fun getItemCount(): Int = differ.currentList.size

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
       holder.bind(differ.currentList[position],onItemClickListener)
    }
}