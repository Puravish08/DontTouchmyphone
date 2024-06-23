package com.donttouchphone.phone.ui.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.donttouchphone.phone.R;
import com.donttouchphone.phone.ui.ViewIntrudersActivity;
import com.donttouchphone.phone.util.ViewKt;
import com.bumptech.glide.Glide;

import java.io.File;
import java.util.ArrayList;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0014H\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0014H\u0016J&\u0010\u001d\u001a\u00020\u00162\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u00122\u0006\u0010\u001f\u001a\u00020\u0007R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0005R\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/adapters/ViewIntrudersAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/donttouchphone/antitheftalarm/ui/adapters/ViewIntrudersAdapter$ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "activity", "Lcom/donttouchphone/antitheftalarm/ui/ViewIntrudersActivity;", "getActivity", "()Lcom/donttouchphone/antitheftalarm/ui/ViewIntrudersActivity;", "setActivity", "(Lcom/donttouchphone/antitheftalarm/ui/ViewIntrudersActivity;)V", "getContext", "()Landroid/content/Context;", "setContext", "imagesList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getItemCount", "", "onBindViewHolder", "", "viewHolder", "position", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "i", "setData", "intrudersImages", "viewIntrudersActivity", "ViewHolder", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: ViewIntrudersAdapter.kt */
public final class ViewIntrudersAdapter extends RecyclerView.Adapter<ViewIntrudersAdapter.ViewHolder> {
    private ViewIntrudersActivity activity;
    private Context context;
    public ArrayList<String> imagesList = new ArrayList<>();

    public final Context getContext() {
        return this.context;
    }

    public final void setContext(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "<set-?>");
        this.context = context2;
    }

    public ViewIntrudersAdapter(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        this.context = context2;
    }

    public final ViewIntrudersActivity getActivity() {
        return this.activity;
    }

    public final void setActivity(ViewIntrudersActivity viewIntrudersActivity) {
        this.activity = viewIntrudersActivity;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_intruders_item, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new ViewHolder(inflate);
    }

    public final void setData(ArrayList<String> arrayList, ViewIntrudersActivity viewIntrudersActivity) {
        Intrinsics.checkNotNullParameter(arrayList, "intrudersImages");
        Intrinsics.checkNotNullParameter(viewIntrudersActivity, "viewIntrudersActivity");
        this.imagesList = arrayList;
        this.activity = viewIntrudersActivity;
        notifyDataSetChanged();
    }

    public void onBindViewHolder(ViewHolder viewHolder, @SuppressLint("RecyclerView") int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        String str = this.imagesList.get(i);
        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
        String str2 = this.imagesList.get(i);
        Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
//        String substring = str.substring(StringsKt.lastIndexOf$default((CharSequence) str2, RemoteSettings.FORWARD_SLASH_STRING, 0, false, 6, (Object) null) + 1);
//        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
//        int parseLong = (int) (Long.parseLong(StringsKt.replace$default(substring, ".jpg", "", false, 4, (Object) null)) / ((long) 1000));
//        viewHolder.getDatetextView1().setText(IntKt.showOnlyDate(parseLong, this.context, true));
//        viewHolder.getDatetextView2().setText(IntKt.showOnlyTime(parseLong, this.context));
        Glide.with(this.context).load(this.imagesList.get(i)).into(viewHolder.getImageView());
        ViewKt.setSafeOnClickListener$default(viewHolder.getDeleteBtn(), 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.adapters.ViewIntrudersAdapter$onBindViewHolder$1
            {
//                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                Intrinsics.checkNotNullParameter(it, "it");
                arrayList = ViewIntrudersAdapter.this.imagesList;
                if (new File((String) arrayList.get(i)).delete()) {
                    arrayList2 = ViewIntrudersAdapter.this.imagesList;
                    arrayList2.remove(i);
                    ViewIntrudersAdapter.this.notifyDataSetChanged();
                    arrayList3 = ViewIntrudersAdapter.this.imagesList;
                    if (arrayList3.isEmpty()) {
                        ViewIntrudersAdapter.this.getActivity();
                    }
                }
            }
        }, 1, null);
        ViewKt.setSafeOnClickListener$default(viewHolder.getImageContainer(), 0, new Function1<View, Unit>() { // from class: com.donttouchphone.antitheftalarm.ui.adapters.ViewIntrudersAdapter$onBindViewHolder$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
//                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(it, "it");
                arrayList = ViewIntrudersAdapter.this.imagesList;
//                new ViewImageDialog(ViewIntrudersAdapter.this.getActivity(), (String) arrayList.get(i), new Functions<Unit>() {
//                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
//                    public final void invoke2() {
//                    }
//
//
//                });
            }
        }, 1, null);
    }

    public int getItemCount() {
        return this.imagesList.size();
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/adapters/ViewIntrudersAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "datetextView1", "Landroid/widget/TextView;", "getDatetextView1", "()Landroid/widget/TextView;", "setDatetextView1", "(Landroid/widget/TextView;)V", "datetextView2", "getDatetextView2", "setDatetextView2", "deleteBtn", "Landroidx/cardview/widget/CardView;", "getDeleteBtn", "()Landroidx/cardview/widget/CardView;", "setDeleteBtn", "(Landroidx/cardview/widget/CardView;)V", "imageContainer", "getImageContainer", "setImageContainer", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "setImageView", "(Landroid/widget/ImageView;)V", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* compiled from: ViewIntrudersAdapter.kt */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        private TextView datetextView1;
        private TextView datetextView2;
        private CardView deleteBtn;
        private CardView imageContainer;
        private ImageView imageView;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
//            Intrinsics.checkNotNullParameter(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            View findViewById = view.findViewById(R.id.siv);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            this.imageView = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.img_container);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
            this.imageContainer = (CardView) findViewById2;
            View findViewById3 = view.findViewById(R.id.datetextview1);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
            this.datetextView1 = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.datetextview2);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
            this.datetextView2 = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.btnDeleteIntruder);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
            this.deleteBtn = (CardView) findViewById5;
        }

        public final TextView getDatetextView1() {
            return this.datetextView1;
        }

        public final void setDatetextView1(TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.datetextView1 = textView;
        }

        public final TextView getDatetextView2() {
            return this.datetextView2;
        }

        public final void setDatetextView2(TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.datetextView2 = textView;
        }

        public final ImageView getImageView() {
            return this.imageView;
        }

        public final void setImageView(ImageView imageView2) {
            Intrinsics.checkNotNullParameter(imageView2, "<set-?>");
            this.imageView = imageView2;
        }

        public final CardView getImageContainer() {
            return this.imageContainer;
        }

        public final void setImageContainer(CardView cardView) {
            Intrinsics.checkNotNullParameter(cardView, "<set-?>");
            this.imageContainer = cardView;
        }

        public final CardView getDeleteBtn() {
            return this.deleteBtn;
        }

        public final void setDeleteBtn(CardView cardView) {
            Intrinsics.checkNotNullParameter(cardView, "<set-?>");
            this.deleteBtn = cardView;
        }
    }
}
