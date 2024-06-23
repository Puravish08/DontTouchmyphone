package com.donttouchphone.phone.models;

import android.os.Parcel;
import android.os.Parcelable;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006&"}, d2 = {"Lcom/donttouchphone/antitheftalarm/models/SoundsModel;", "Landroid/os/Parcelable;", "soundName", "", "soundMp3", "", "soundAnim", "soundIcon", "soundPosition", "isSelected", "", "(Ljava/lang/String;IIIIZ)V", "()Z", "getSoundAnim", "()I", "getSoundIcon", "getSoundMp3", "getSoundName", "()Ljava/lang/String;", "getSoundPosition", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: SoundsModel.kt */
public final class SoundsModel implements Parcelable {
    public static final Parcelable.Creator<SoundsModel> CREATOR = new Creator();
    private final boolean isSelected;
    private final int soundAnim;
    private final int soundIcon;
    private final int soundMp3;
    private final String soundName;
    private final int soundPosition;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* compiled from: SoundsModel.kt */
    public static final class Creator implements Parcelable.Creator<SoundsModel> {
        public final SoundsModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SoundsModel(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }

        public final SoundsModel[] newArray(int i) {
            return new SoundsModel[i];
        }
    }

    public static /* synthetic */ SoundsModel copy$default(SoundsModel soundsModel, String str, int i, int i2, int i3, int i4, boolean z, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = soundsModel.soundName;
        }
        if ((i5 & 2) != 0) {
            i = soundsModel.soundMp3;
        }
        int i6 = i;
        if ((i5 & 4) != 0) {
            i2 = soundsModel.soundAnim;
        }
        int i7 = i2;
        if ((i5 & 8) != 0) {
            i3 = soundsModel.soundIcon;
        }
        int i8 = i3;
        if ((i5 & 16) != 0) {
            i4 = soundsModel.soundPosition;
        }
        int i9 = i4;
        if ((i5 & 32) != 0) {
            z = soundsModel.isSelected;
        }
        return soundsModel.copy(str, i6, i7, i8, i9, z);
    }

    public final String component1() {
        return this.soundName;
    }

    public final int component2() {
        return this.soundMp3;
    }

    public final int component3() {
        return this.soundAnim;
    }

    public final int component4() {
        return this.soundIcon;
    }

    public final int component5() {
        return this.soundPosition;
    }

    public final boolean component6() {
        return this.isSelected;
    }

    public final SoundsModel copy(String str, int i, int i2, int i3, int i4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "soundName");
        return new SoundsModel(str, i, i2, i3, i4, z);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SoundsModel)) {
            return false;
        }
        SoundsModel soundsModel = (SoundsModel) obj;
        return Intrinsics.areEqual((Object) this.soundName, (Object) soundsModel.soundName) && this.soundMp3 == soundsModel.soundMp3 && this.soundAnim == soundsModel.soundAnim && this.soundIcon == soundsModel.soundIcon && this.soundPosition == soundsModel.soundPosition && this.isSelected == soundsModel.isSelected;
    }

    public int hashCode() {
        int hashCode = ((((((((this.soundName.hashCode() * 31) + Integer.hashCode(this.soundMp3)) * 31) + Integer.hashCode(this.soundAnim)) * 31) + Integer.hashCode(this.soundIcon)) * 31) + Integer.hashCode(this.soundPosition)) * 31;
        boolean z = this.isSelected;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "SoundsModel(soundName=" + this.soundName + ", soundMp3=" + this.soundMp3 + ", soundAnim=" + this.soundAnim + ", soundIcon=" + this.soundIcon + ", soundPosition=" + this.soundPosition + ", isSelected=" + this.isSelected + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.soundName);
        parcel.writeInt(this.soundMp3);
        parcel.writeInt(this.soundAnim);
        parcel.writeInt(this.soundIcon);
        parcel.writeInt(this.soundPosition);
        parcel.writeInt(this.isSelected ? 1 : 0);
    }

    public SoundsModel(String str, int i, int i2, int i3, int i4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "soundName");
        this.soundName = str;
        this.soundMp3 = i;
        this.soundAnim = i2;
        this.soundIcon = i3;
        this.soundPosition = i4;
        this.isSelected = z;
    }

    public final String getSoundName() {
        return this.soundName;
    }

    public final int getSoundMp3() {
        return this.soundMp3;
    }

    public final int getSoundAnim() {
        return this.soundAnim;
    }

    public final int getSoundIcon() {
        return this.soundIcon;
    }

    public final int getSoundPosition() {
        return this.soundPosition;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }
}
