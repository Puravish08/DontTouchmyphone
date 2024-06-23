//package com.donttouchphone.antitheftalarm.ui.adapters;
//
//import android.app.Activity;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import androidx.constraintlayout.widget.ConstraintLayout;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.donttouchphone.antitheftalarm.R;
//import com.donttouchphone.antitheftalarm.databinding.ItemViewSoundsImgBinding;
//import com.donttouchphone.antitheftalarm.models.SoundsModel;
//import com.donttouchphone.antitheftalarm.util.ViewKt;
//import java.util.ArrayList;
//import java.util.List;
//import kotlin.Metadata;
//import kotlin.Unit;
//import kotlin.jvm.functions.Function1;
//import kotlin.jvm.internal.Intrinsics;
//
//@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u001c\u0010\u0012\u001a\u00020\u000e2\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u001c\u0010\u0019\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\u0006\u0010\u001b\u001a\u00020\u0010J\u001a\u0010\u001c\u001a\u00020\u000e2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/adapters/SoundsGridAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/donttouchphone/antitheftalarm/ui/adapters/SoundsGridAdapter$ViewHolder;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "items", "Ljava/util/ArrayList;", "Lcom/donttouchphone/antitheftalarm/models/SoundsModel;", "Lkotlin/collections/ArrayList;", "listenerPlay", "Lkotlin/Function1;", "", "soundPosition", "", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "", "soundPos", "setOnPlayClickListener", "listenerP", "ViewHolder", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
///* compiled from: SoundsGridAdapter.kt */
//public final class SoundsGridAdapter extends RecyclerView.Adapter<SoundsGridAdapter.ViewHolder> {
//    private final Activity activity;
//    private final ArrayList<SoundsModel> items = new ArrayList<>();
//    /* access modifiers changed from: private */
//    public Function1<? super SoundsModel, Unit> listenerPlay;
//    /* access modifiers changed from: private */
//    public int soundPosition;
//
//    public final Activity getActivity() {
//        return this.activity;
//    }
//
//    public SoundsGridAdapter(Activity activity2) {
//        Intrinsics.checkNotNullParameter(activity2, "activity");
//        this.activity = activity2;
//    }
//
//    public final void setItems(List<SoundsModel> list, int i) {
//        Intrinsics.checkNotNullParameter(list, null);
//        this.soundPosition = i;
//        this.items.clear();
//        this.items.addAll(list);
//        notifyDataSetChanged();
//    }
//
//    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/adapters/SoundsGridAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/donttouchphone/antitheftalarm/databinding/ItemViewSoundsImgBinding;", "(Lcom/donttouchphone/antitheftalarm/ui/adapters/SoundsGridAdapter;Lcom/donttouchphone/antitheftalarm/databinding/ItemViewSoundsImgBinding;)V", "getBinding", "()Lcom/donttouchphone/antitheftalarm/databinding/ItemViewSoundsImgBinding;", "onBind", "", "model", "Lcom/donttouchphone/antitheftalarm/models/SoundsModel;", "position", "", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
//    /* compiled from: SoundsGridAdapter.kt */
//    public final class ViewHolder extends RecyclerView.ViewHolder {
//        private final ItemViewSoundsImgBinding binding;
//        final /* synthetic */ SoundsGridAdapter this$0;
//
//        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
//        public ViewHolder(SoundsGridAdapter soundsGridAdapter, ItemViewSoundsImgBinding itemViewSoundsImgBinding) {
//            super(itemViewSoundsImgBinding.getRoot());
//            Intrinsics.checkNotNullParameter(itemViewSoundsImgBinding, "binding");
//            this.this$0 = soundsGridAdapter;
//            this.binding = itemViewSoundsImgBinding;
//        }
//
//        public final ItemViewSoundsImgBinding getBinding() {
//            return this.binding;
//        }
//
//        public final void onBind(SoundsModel soundsModel, int i) {
//            Intrinsics.checkNotNullParameter(soundsModel, "model");
//            this.binding.alaramLoud.setImageDrawable(this.this$0.getActivity().getResources().getDrawable(soundsModel.getSoundIcon()));
//            if (i == this.this$0.soundPosition) {
//                this.binding.getRoot().setBackgroundResource(R.drawable.circle_back_slected);
//            } else {
//                this.binding.getRoot().setBackgroundResource(R.drawable.circle_back);
//            }
//            ConstraintLayout root = this.binding.getRoot();
//            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
//            ViewKt.setSafeOnClickListener$default(root, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.adapters.SoundsGridAdapter$ViewHolder$onBind$1
//                /* JADX INFO: Access modifiers changed from: package-private */
//                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
//                {
////                    super(1);
//                }
//
//                @Override // kotlin.jvm.functions.Function1
//                public /* bridge */ /* synthetic */ Unit invoke(View view) {
//                    invoke2(view);
//                    return Unit.INSTANCE;
//                }
//
//                /* renamed from: invoke  reason: avoid collision after fix types in other method */
//                public final void invoke2(View it) {
//                    Function1 function1;
//                    Intrinsics.checkNotNullParameter(it, "it");
//                    SoundsGridAdapter.this.soundPosition = i;
//                    function1 = SoundsGridAdapter.this.listenerPlay;
//                    if (function1 == null) {
//                        Intrinsics.throwUninitializedPropertyAccessException("listenerPlay");
//                        function1 = null;
//                    }
//                    function1.invoke(soundsModel);
//                    SoundsGridAdapter.this.notifyDataSetChanged();
//                }
//            }, 1, null);
//        }
//    }
//
//    public final void setOnPlayClickListener(Function1<? super SoundsModel, Unit> function1) {
//        Intrinsics.checkNotNullParameter(function1, "listenerP");
//        this.listenerPlay = function1;
//    }
//
//    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
//        Intrinsics.checkNotNullParameter(viewGroup, "parent");
//        ItemViewSoundsImgBinding inflate = ItemViewSoundsImgBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
//        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
//        return new ViewHolder(this, inflate);
//    }
//
//    public int getItemCount() {
//        return this.items.size();
//    }
//
//    public void onBindViewHolder(ViewHolder viewHolder, int i) {
//        Intrinsics.checkNotNullParameter(viewHolder, "holder");
//        SoundsModel soundsModel = this.items.get(i);
//        Intrinsics.checkNotNullExpressionValue(soundsModel, "get(...)");
//        viewHolder.onBind(soundsModel, i);
//    }
//}
package com.donttouchphone.phone.ui.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.donttouchphone.phone.R;
import com.donttouchphone.phone.databinding.ItemViewSoundsImgBinding;
import com.donttouchphone.phone.models.SoundsModel;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class SoundsGridAdapter extends RecyclerView.Adapter<SoundsGridAdapter.ViewHolder> {
    private final Activity activity;
    private final ArrayList<SoundsModel> items = new ArrayList<>();
    private Function1<? super SoundsModel, Unit> listenerPlay;
    private int soundPosition = -1; // Initialize soundPosition with -1

    public SoundsGridAdapter(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
    }

    public final void setItems(List<SoundsModel> list, int soundPos) {
        Intrinsics.checkNotNullParameter(list, "items");
        this.soundPosition = soundPos;
        this.items.clear();
        this.items.addAll(list);
        notifyDataSetChanged();
    }

    public final void setOnPlayClickListener(Function1<? super SoundsModel, Unit> listenerP) {
        Intrinsics.checkNotNullParameter(listenerP, "listenerP");
        this.listenerPlay = listenerP;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemViewSoundsImgBinding binding = ItemViewSoundsImgBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        SoundsModel soundsModel = items.get(position);
        holder.bind(soundsModel, position);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final ItemViewSoundsImgBinding binding;

        public ViewHolder(ItemViewSoundsImgBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(SoundsModel soundsModel, int position) {
            binding.alaramLoud.setImageDrawable(activity.getResources().getDrawable(soundsModel.getSoundIcon()));

            if (position == soundPosition) {
                binding.getRoot().setBackgroundResource(R.drawable.circle_back_slected);
            } else {
                binding.getRoot().setBackgroundResource(R.drawable.circle_back);
            }

            binding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    soundPosition = position;
                    if (listenerPlay != null) {
                        listenerPlay.invoke(soundsModel);
                    }
                    notifyDataSetChanged();
                }
            });
        }
    }
}
