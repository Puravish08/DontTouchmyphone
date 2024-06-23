package com.donttouchphone.phone.ui.adapters;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.donttouchphone.phone.R;
import com.donttouchphone.phone.databinding.ItemViewLanguageBinding;
import com.donttouchphone.phone.models.CountryModel;
import com.donttouchphone.phone.util.ViewKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u0003:\u0001\u001fB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0015\u001a\u00020\u00102\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u001c\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0014H\u0016J\u0014\u0010\u001c\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001dJ\u001a\u0010\u001e\u001a\u00020\u00102\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000fX.¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/adapters/LanguagesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/donttouchphone/antitheftalarm/ui/adapters/LanguagesAdapter$ViewHolder;", "Landroid/widget/Filterable;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "filterItems", "Ljava/util/ArrayList;", "Lcom/donttouchphone/antitheftalarm/models/CountryModel;", "Lkotlin/collections/ArrayList;", "items", "listener", "Lkotlin/Function1;", "", "getFilter", "Landroid/widget/Filter;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "", "setSafeOnClickListener", "ViewHolder", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: LanguagesAdapter.kt */
public final class LanguagesAdapter extends RecyclerView.Adapter<LanguagesAdapter.ViewHolder> implements Filterable {
    private final Activity activity;
    public ArrayList<CountryModel> filterItems = new ArrayList<>();
    public final ArrayList<CountryModel> items = new ArrayList<>();

    public final Activity getActivity() {
        return this.activity;
    }

    public LanguagesAdapter(Activity activity2) {
        Intrinsics.checkNotNullParameter(activity2, "activity");
        this.activity = activity2;
    }

    public final void setItems(List<CountryModel> list) {
        this.items.clear();
        this.filterItems.clear();
        Collection collection = list;
        this.items.addAll(collection);
        this.filterItems.addAll(collection);
        notifyDataSetChanged();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/adapters/LanguagesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/donttouchphone/antitheftalarm/databinding/ItemViewLanguageBinding;", "(Lcom/donttouchphone/antitheftalarm/ui/adapters/LanguagesAdapter;Lcom/donttouchphone/antitheftalarm/databinding/ItemViewLanguageBinding;)V", "getBinding", "()Lcom/donttouchphone/antitheftalarm/databinding/ItemViewLanguageBinding;", "onBind", "", "country", "Lcom/donttouchphone/antitheftalarm/models/CountryModel;", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* compiled from: LanguagesAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final ItemViewLanguageBinding binding;
        final /* synthetic */ LanguagesAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(LanguagesAdapter languagesAdapter, ItemViewLanguageBinding itemViewLanguageBinding) {
            super(itemViewLanguageBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemViewLanguageBinding, "binding");
            this.this$0 = languagesAdapter;
            this.binding = itemViewLanguageBinding;
        }

        public final ItemViewLanguageBinding getBinding() {
            return this.binding;
        }

        public final void onBind(CountryModel countryModel) {
            Intrinsics.checkNotNullParameter(countryModel, "country");
            this.binding.tvTitle.setText(countryModel.getName());

            if (Intrinsics.areEqual((Object) countryModel.getCode(), (Object) LanguagesAdapterKt.getLanguageCodeForApp())) {
                this.binding.getRoot().setBackground(this.itemView.getContext().getResources().getDrawable(R.drawable.setting_selected_btn));
            } else {
                this.binding.getRoot().setBackground(this.itemView.getContext().getResources().getDrawable(R.drawable.setting_unselected_btn));
            }

            Log.d("ItemViewLanguageBinding", "onBind: " + countryModel.getFlag());

            // Get resource ID for the flag drawable
            int flagResId = this.itemView.getContext().getResources().getIdentifier(countryModel.getFlag(), "drawable", this.itemView.getContext().getPackageName());
            if (flagResId != 0) {
                this.binding.ivFlag.setImageDrawable(this.itemView.getContext().getDrawable(flagResId));
            } else {
                Log.e("ItemViewLanguageBinding", "Error: Resource not found for flag " + countryModel.getFlag());
                // Handle the error, e.g., set a default drawable or hide the ImageView
                this.binding.ivFlag.setImageDrawable(this.itemView.getContext().getDrawable(R.drawable.flag_hindi));
            }

            ConstraintLayout root = this.binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            final LanguagesAdapter languagesAdapter = LanguagesAdapter.this;
            ViewKt.setSafeOnClickListener$default(root, 0, new Function1<View, Unit>() {
                @Override
                public Unit invoke(View view) {
                    Intrinsics.checkNotNullParameter(view, "it");
                    LanguagesAdapterKt.setLanguageCodeForApp(countryModel.getCode());
                    languagesAdapter.notifyDataSetChanged();
                    return Unit.INSTANCE;
                }
            }, 1, null);
        }

    }

    public final void setSafeOnClickListener(Function1<? super CountryModel, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ItemViewLanguageBinding inflate = ItemViewLanguageBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new ViewHolder(this, inflate);
    }

    public int getItemCount() {
        return this.filterItems.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        CountryModel countryModel = this.filterItems.get(i);
        Intrinsics.checkNotNullExpressionValue(countryModel, "get(...)");
        viewHolder.onBind(countryModel);
    }

    public Filter getFilter() {
        return new LanguagesAdapter$getFilter$1(this);
    }
}
