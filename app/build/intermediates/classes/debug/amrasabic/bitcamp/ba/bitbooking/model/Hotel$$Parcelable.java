
package amrasabic.bitcamp.ba.bitbooking.model;

import java.util.ArrayList;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.InjectionUtil;
import org.parceler.ParcelWrapper;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2015-11-11T23:52+0100")
public class Hotel$$Parcelable
    implements Parcelable, ParcelWrapper<amrasabic.bitcamp.ba.bitbooking.model.Hotel>
{

    private amrasabic.bitcamp.ba.bitbooking.model.Hotel hotel$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Hotel$$Parcelable.Creator$$2 CREATOR = new Hotel$$Parcelable.Creator$$2();

    public Hotel$$Parcelable(android.os.Parcel parcel$$10) {
        hotel$$0 = new amrasabic.bitcamp.ba.bitbooking.model.Hotel();
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mAddress", parcel$$10 .readString());
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mHotelName", parcel$$10 .readString());
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mCity", parcel$$10 .readString());
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mCountry", parcel$$10 .readString());
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mRating", parcel$$10 .readInt());
        int int$$6 = parcel$$10 .readInt();
        ArrayList<amrasabic.bitcamp.ba.bitbooking.model.Image> list$$2;
        if (int$$6 < 0) {
            list$$2 = null;
        } else {
            list$$2 = new ArrayList<amrasabic.bitcamp.ba.bitbooking.model.Image>();
            for (int int$$7 = 0; (int$$7 <int$$6); int$$7 ++) {
                amrasabic.bitcamp.ba.bitbooking.model.Image image$$5;
                if (parcel$$10 .readInt() == -1) {
                    image$$5 = null;
                } else {
                    image$$5 = readamrasabic_bitcamp_ba_bitbooking_model_Image(parcel$$10);
                }
                list$$2 .add(image$$5);
            }
        }
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mRoomImages", list$$2);
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mDescription", parcel$$10 .readString());
        int int$$8 = parcel$$10 .readInt();
        java.lang.Integer integer$$2;
        if (int$$8 < 0) {
            integer$$2 = null;
        } else {
            integer$$2 = parcel$$10 .readInt();
        }
        InjectionUtil.setField(amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mHotelId", integer$$2);
    }

    public Hotel$$Parcelable(amrasabic.bitcamp.ba.bitbooking.model.Hotel hotel$$1) {
        hotel$$0 = hotel$$1;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$11, int flags) {
        parcel$$11 .writeString(InjectionUtil.getField(java.lang.String.class, amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mAddress"));
        parcel$$11 .writeString(InjectionUtil.getField(java.lang.String.class, amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mHotelName"));
        parcel$$11 .writeString(InjectionUtil.getField(java.lang.String.class, amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mCity"));
        parcel$$11 .writeString(InjectionUtil.getField(java.lang.String.class, amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mCountry"));
        parcel$$11 .writeInt(InjectionUtil.getField(int.class, amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mRating"));
        if (InjectionUtil.getField(java.util.List.class, amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mRoomImages") == null) {
            parcel$$11 .writeInt(-1);
        } else {
            parcel$$11 .writeInt(InjectionUtil.getField(java.util.List.class, amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mRoomImages").size());
            for (amrasabic.bitcamp.ba.bitbooking.model.Image image$$6 : ((java.util.List<amrasabic.bitcamp.ba.bitbooking.model.Image> ) InjectionUtil.getField(java.util.List.class, amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mRoomImages"))) {
                if (image$$6 == null) {
                    parcel$$11 .writeInt(-1);
                } else {
                    parcel$$11 .writeInt(1);
                    writeamrasabic_bitcamp_ba_bitbooking_model_Image(image$$6, parcel$$11);
                }
            }
        }
        parcel$$11 .writeString(InjectionUtil.getField(java.lang.String.class, amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mDescription"));
        if (InjectionUtil.getField(java.lang.Integer.class, amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mHotelId") == null) {
            parcel$$11 .writeInt(-1);
        } else {
            parcel$$11 .writeInt(1);
            parcel$$11 .writeInt(InjectionUtil.getField(java.lang.Integer.class, amrasabic.bitcamp.ba.bitbooking.model.Hotel.class, hotel$$0, "mHotelId"));
        }
    }

    private amrasabic.bitcamp.ba.bitbooking.model.Image readamrasabic_bitcamp_ba_bitbooking_model_Image(android.os.Parcel parcel$$12) {
        amrasabic.bitcamp.ba.bitbooking.model.Image image$$4;
        image$$4 = new amrasabic.bitcamp.ba.bitbooking.model.Image();
        image$$4 .mImageUrl = parcel$$12 .readString();
        image$$4 .mImageId = parcel$$12 .readInt();
        image$$4 .mThumbnail = parcel$$12 .readString();
        return image$$4;
    }

    private void writeamrasabic_bitcamp_ba_bitbooking_model_Image(amrasabic.bitcamp.ba.bitbooking.model.Image image$$7, android.os.Parcel parcel$$13) {
        parcel$$13 .writeString(image$$7 .mImageUrl);
        parcel$$13 .writeInt(image$$7 .mImageId);
        parcel$$13 .writeString(image$$7 .mThumbnail);
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public amrasabic.bitcamp.ba.bitbooking.model.Hotel getParcel() {
        return hotel$$0;
    }

    private final static class Creator$$2
        implements Creator<Hotel$$Parcelable>
    {


        @Override
        public Hotel$$Parcelable createFromParcel(android.os.Parcel parcel$$14) {
            return new Hotel$$Parcelable(parcel$$14);
        }

        @Override
        public Hotel$$Parcelable[] newArray(int size) {
            return new Hotel$$Parcelable[size] ;
        }

    }

}
