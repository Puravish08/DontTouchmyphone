package com.donttouchphone.phone.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/donttouchphone/antitheftalarm/models/CountryModel;", "", "name", "", "code", "flag", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getFlag", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: CountryModel.kt */
public final class CountryModel {
    private final String code;
    private final String flag;
    private final String name;

    public static /* synthetic */ CountryModel copy$default(CountryModel countryModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = countryModel.name;
        }
        if ((i & 2) != 0) {
            str2 = countryModel.code;
        }
        if ((i & 4) != 0) {
            str3 = countryModel.flag;
        }
        return countryModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.code;
    }

    public final String component3() {
        return this.flag;
    }

    public final CountryModel copy(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "code");
        Intrinsics.checkNotNullParameter(str3, "flag");
        return new CountryModel(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountryModel)) {
            return false;
        }
        CountryModel countryModel = (CountryModel) obj;
        return Intrinsics.areEqual((Object) this.name, (Object) countryModel.name) && Intrinsics.areEqual((Object) this.code, (Object) countryModel.code) && Intrinsics.areEqual((Object) this.flag, (Object) countryModel.flag);
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.code.hashCode()) * 31) + this.flag.hashCode();
    }

    public String toString() {
        return "CountryModel(name=" + this.name + ", code=" + this.code + ", flag=" + this.flag + ')';
    }

    public CountryModel(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "code");
        Intrinsics.checkNotNullParameter(str3, "flag");
        this.name = str;
        this.code = str2;
        this.flag = str3;
    }

    public final String getName() {
        return this.name;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getFlag() {
        return this.flag;
    }
}
