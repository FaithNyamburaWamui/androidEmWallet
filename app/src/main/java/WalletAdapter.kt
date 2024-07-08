import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.helper.widget.Carousel.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.enwallet.R

class WalletAdapter(val wallets:List<Wallet>):RecyclerView.Adapter<WalletViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WalletViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.wallet_list_article,parent,false)
        return WalletViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return wallets.size
    }

    override fun onBindViewHolder(holder: WalletViewHolder, position: Int) {
        val wallets=wallets[position]
        holder.salary.text=wallets.salary
        holder.tvCash3.text=wallets.money
        holder.date.text=wallets.date
    }

}

class WalletViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    val salary=itemView.findViewById<TextView>(R.id.salary)
    val tvCash3=itemView.findViewById<TextView>(R.id.tvCash3)
    val date=itemView.findViewById<TextView>(R.id.date)


}