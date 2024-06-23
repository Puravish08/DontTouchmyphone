package com.donttouchphone.phone.ui.adapters;

import android.widget.Filter;

import com.donttouchphone.phone.models.CountryModel;

import java.util.ArrayList;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0014¨\u0006\n"}, d2 = {"com/donttouchphone/phone/ui/adapters/LanguagesAdapter$getFilter$1", "Landroid/widget/Filter;", "performFiltering", "Landroid/widget/Filter$FilterResults;", "charSequence", "", "publishResults", "", "constraint", "results", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: LanguagesAdapter.kt */
public final class LanguagesAdapter$getFilter$1 extends Filter {
    final /* synthetic */ LanguagesAdapter this$0;

    LanguagesAdapter$getFilter$1(LanguagesAdapter languagesAdapter) {
        this.this$0 = languagesAdapter;
    }

    /* access modifiers changed from: protected */
    public FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        String obj = charSequence.toString();
        LanguagesAdapter languagesAdapter = this.this$0;
        CharSequence charSequence2 = obj;
        if (charSequence2.length() == 0) {
            arrayList = this.this$0.items;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (CountryModel countryModel : this.this$0.items) {
                if (StringsKt.contains((CharSequence) countryModel.getName(), charSequence2, true)) {
                    arrayList2.add(countryModel);
                }
            }
            arrayList = arrayList2;
        }
        languagesAdapter.filterItems = arrayList;
        FilterResults filterResults = new FilterResults();
        filterResults.values = this.this$0.filterItems;
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, FilterResults filterResults) {
        LanguagesAdapter languagesAdapter = this.this$0;
        Object obj = filterResults != null ? filterResults.values : null;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<com.donttouchphone.phone.models.CountryModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.donttouchphone.phone.models.CountryModel> }");
        languagesAdapter.filterItems = (ArrayList) obj;
        this.this$0.notifyDataSetChanged();
    }
}
