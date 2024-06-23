package com.donttouchphone.phone.ui.intro;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.donttouchphone.phone.ui.intro.helpFragment.FragmentHelp1;
import com.donttouchphone.phone.ui.intro.helpFragment.HelpFragment2;
import com.donttouchphone.phone.ui.intro.helpFragment.HelpFragment3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/donttouchphone/antitheftalarm/ui/intro/HelpPagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "context", "Landroid/content/Context;", "(Landroidx/fragment/app/FragmentActivity;Landroid/content/Context;)V", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItemCount", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: HelpPagerAdapter.kt */
public final class HelpPagerAdapter extends FragmentStateAdapter {
    private final Context context;

    public int getItemCount() {
        return 3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HelpPagerAdapter(FragmentActivity fragmentActivity, Context context2) {
        super(fragmentActivity);
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(context2, "context");
        this.context = context2;
    }

    public Fragment createFragment(int i) {
        if (i == 0) {
            return new FragmentHelp1();
        }
        if (i == 1) {
            return new HelpFragment2();
        }
        if (i != 2) {
            return new HelpFragment3();
        }
        return new HelpFragment3();
    }
}
