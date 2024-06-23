package com.donttouchphone.phone.ui.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.donttouchphone.phone.R;
import com.donttouchphone.phone.databinding.ItemViewSoundsBinding;
import com.donttouchphone.phone.models.SoundsModel;
import com.donttouchphone.phone.util.ContextKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\"B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u00102\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u001c\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016J\u0014\u0010\u001d\u001a\u00020\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u001eJ \u0010\u001f\u001a\u00020\u00102\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u0012J\u001a\u0010!\u001a\u00020\u00102\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000fX\u0082.¢\u0006\u0002\n\u0000R \u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u0012X\u0082.¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/adapters/SoundsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/donttouchphone/antitheftalarm/ui/adapters/SoundsAdapter$ViewHolder;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "TAG", "", "getActivity", "()Landroid/app/Activity;", "Lcom/donttouchphone/antitheftalarm/models/SoundsModel;", "Lkotlin/collections/ArrayList;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "", "listenerPlay", "Lkotlin/Function2;", "Landroid/widget/ImageView;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "", "setOnPlayClickListener", "listenerP", "setSafeOnClickListener", "ViewHolder", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)

public final class SoundsAdapter extends RecyclerView.Adapter<SoundsAdapter.ViewHolder> {
    private final String TAG;
    private final Activity activity;
    private final ArrayList<SoundsModel> items;
    private Function1<? super SoundsModel, Unit> listener;
    private Function2<? super SoundsModel, ? super ImageView, Unit> listenerPlay;

    public final Activity getActivity() {
        return this.activity;
    }

    public SoundsAdapter(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        this.TAG = "SoundsAdapter";
        this.items = new ArrayList<>();
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setItems(List<SoundsModel> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items.clear();
        this.items.addAll(items);
        notifyDataSetChanged();
    }


    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/adapters/SoundsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/donttouchphone/antitheftalarm/databinding/ItemViewSoundsBinding;", "(Lcom/donttouchphone/antitheftalarm/ui/adapters/SoundsAdapter;Lcom/donttouchphone/antitheftalarm/databinding/ItemViewSoundsBinding;)V", "getBinding", "()Lcom/donttouchphone/antitheftalarm/databinding/ItemViewSoundsBinding;", "onBind", "", "model", "Lcom/donttouchphone/antitheftalarm/models/SoundsModel;", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)

    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final ItemViewSoundsBinding binding;
        final SoundsAdapter this$0;

        public ViewHolder(SoundsAdapter soundsAdapter, ItemViewSoundsBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = soundsAdapter;
            this.binding = binding;
        }

        public final ItemViewSoundsBinding getBinding() {
            return this.binding;
        }

//        public void onBind(final SoundsModel model) {
//            Intrinsics.checkNotNullParameter(model, "model");
//            this.binding.customSoundText.setText(model.getSoundName());
//            Log.d(this.this$0.TAG, "onBind: activity.baseConfig.currentRingtone====== " + ContextKt.getBaseConfig(this.this$0.getActivity()).getCurrentRingtone());
//            Log.d(this.this$0.TAG, "onBind:currentRingtone---- " + Uri.parse("android.resource://" + this.this$0.getActivity().getPackageName() + '/' + model.getSoundMp3()));
//            if (Intrinsics.areEqual(ContextKt.getBaseConfig(this.this$0.getActivity()).getCurrentRingtone(), Uri.parse("android.resource://" + this.this$0.getActivity().getPackageName() + '/' + model.getSoundMp3()).toString())) {
//                this.binding.clRoot.setBackgroundResource(R.drawable.btn_gradient_background);
//                this.binding.customSoundText.setTextColor(this.this$0.getActivity().getResources().getColor(R.color.white));
//                this.binding.playalaram.setColorFilter(this.this$0.getActivity().getResources().getColor(R.color.white));
//            } else {
//                this.binding.clRoot.setBackgroundResource(R.drawable.btn_white_background);
//                this.binding.customSoundText.setTextColor(this.this$0.getActivity().getResources().getColor(R.color.blue));
//                this.binding.playalaram.setColorFilter(this.this$0.getActivity().getResources().getColor(R.color.blue));
//            }
//            binding.ivCustomSound.setImageDrawable(this.this$0.getActivity().getResources().getDrawable(model.getSoundIcon()));
//            ImageView playalaram = this.binding.playalaram;
//            Intrinsics.checkNotNullExpressionValue(playalaram, "playalaram");
//            final SoundsAdapter soundsAdapter = this.this$0;
//                ViewKt.setSafeOnClickListener$default(playalaram, 0, new Function1<View, Unit>() {
//                    {
//    //                    super(1);
//                    }
//
//                    @Override
//                    public  Unit invoke(View view) {
//                        invoke2(view);
//                        return Unit.INSTANCE;
//                    }
//                    public  void invoke2(View it) {
//                        Function2 function2;
//                        Intrinsics.checkNotNullParameter(it, "it");
//                        function2 = SoundsAdapter.this.listenerPlay;
//                        if (function2 == null) {
//                            Intrinsics.throwUninitializedPropertyAccessException("listenerPlay");
//                            function2 = null;
//                        }
//                        SoundsModel soundsModel = model;
//                        ImageView playalaram2 = getBinding().playalaram;
//                        Intrinsics.checkNotNullExpressionValue(playalaram2, "playalaram");
//                        function2.invoke(soundsModel, playalaram2);
//                    }
//                }, 1, null);
//            ConstraintLayout root = this.binding.getRoot();
//            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
//            final SoundsAdapter soundsAdapter2 = this.this$0;
//            ViewKt.setSafeOnClickListener$default(root, 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.adapters.SoundsAdapter$ViewHolder$onBind$2
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
//                    function1 = SoundsAdapter.this.listener;
//                    if (function1 == null) {
//                        Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
//                        function1 = null;
//                    }
//                    function1.invoke(model);
//                    SoundsAdapter.this.notifyDataSetChanged();
//                }
//            }, 1, null);



        public void onBind(final SoundsModel model) {
            if (model == null) throw new IllegalArgumentException("model cannot be null");
            binding.customSoundText.setText(model.getSoundName());
            Log.d(TAG, "onBind: activity.baseConfig.currentRingtone====== " + ContextKt.getBaseConfig(activity).getCurrentRingtone());
            Log.d(TAG, "onBind:currentRingtone---- " + Uri.parse("android.resource://" + activity.getPackageName() + '/' + model.getSoundMp3()));

            if (ContextKt.getBaseConfig(activity).getCurrentRingtone().equals(Uri.parse("android.resource://" + activity.getPackageName() + '/' + model.getSoundMp3()).toString())) {
                binding.clRoot.setBackgroundResource(R.drawable.btn_gradient_background);
                binding.customSoundText.setTextColor(activity.getResources().getColor(R.color.white));
                binding.playalaram.setColorFilter(activity.getResources().getColor(R.color.white));
            } else {
                binding.clRoot.setBackgroundResource(R.drawable.btn_white_background);
                binding.customSoundText.setTextColor(activity.getResources().getColor(R.color.blue));
                binding.playalaram.setColorFilter(activity.getResources().getColor(R.color.blue));
            }

            binding.ivCustomSound.setImageDrawable(activity.getResources().getDrawable(model.getSoundIcon()));

            final ImageView playalaram = binding.playalaram;
            if (playalaram == null) throw new IllegalStateException("playalaram cannot be null");

            playalaram.setOnClickListener(view -> {
                if (listenerPlay == null) {
                    Log.e(TAG, "listenerPlay is not initialized");
                    return;
                }
                listenerPlay.invoke(model, playalaram);
            });

            ConstraintLayout root = binding.getRoot();
            if (root == null) throw new IllegalStateException("root cannot be null");

            root.setOnClickListener(view -> {
                if (listener == null) {
                    Log.e(TAG, "listener is not initialized");
                    return;
                }
                listener.invoke(model);
                SoundsAdapter.this.notifyDataSetChanged();
            });
        }


    }

    public final void setSafeOnClickListener(Function1<? super SoundsModel, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    public final void setOnPlayClickListener(Function2<? super SoundsModel, ? super ImageView, Unit> listenerP) {
        Intrinsics.checkNotNullParameter(listenerP, "listenerP");
        this.listenerPlay = listenerP;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemViewSoundsBinding inflate = ItemViewSoundsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new ViewHolder(this, inflate);
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        SoundsModel soundsModel = this.items.get(i);
        Intrinsics.checkNotNullExpressionValue(soundsModel, "get(...)");
        holder.onBind(soundsModel);
    }
}