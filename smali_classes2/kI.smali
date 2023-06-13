.class public interface abstract LkI;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H&J\u000e\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000cH&J\u000e\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000cH&J\u0016\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000c2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000c2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u000c2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H&J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H&J\u0018\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH&J\u0008\u0010\u001e\u001a\u00020\nH&J\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0008H&\u00a8\u0006 "
    }
    d2 = {
        "LkI;",
        "",
        "Lco/bird/android/model/VehicleDescriptor;",
        "vehicleDescriptor",
        "LXn1$a;",
        "i",
        "Lco/bird/android/model/persistence/Bird;",
        "bird",
        "Lco/bird/android/model/persistence/VehicleVersion;",
        "vehicleVersion",
        "Lio/reactivex/c;",
        "e",
        "Lio/reactivex/Observable;",
        "d",
        "n",
        "",
        "c",
        "k",
        "",
        "h",
        "LWn1;",
        "g",
        "b",
        "",
        "data",
        "",
        "f",
        "",
        "passcode",
        "j",
        "m",
        "l",
        "core-interface_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract b(Lco/bird/android/model/VehicleDescriptor;)Lio/reactivex/c;
.end method

.method public abstract c(Lco/bird/android/model/VehicleDescriptor;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/VehicleDescriptor;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/VehicleDescriptor;",
            ">;"
        }
    .end annotation
.end method

.method public abstract e(Lco/bird/android/model/persistence/Bird;Lco/bird/android/model/persistence/VehicleVersion;)Lio/reactivex/c;
.end method

.method public abstract f([B)V
.end method

.method public abstract g(Lco/bird/android/model/persistence/Bird;Lco/bird/android/model/persistence/VehicleVersion;)LWn1;
.end method

.method public abstract h(Lco/bird/android/model/VehicleDescriptor;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/VehicleDescriptor;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end method

.method public abstract i(Lco/bird/android/model/VehicleDescriptor;)LXn1$a;
.end method

.method public abstract j(Lco/bird/android/model/VehicleDescriptor;Ljava/lang/String;)Lio/reactivex/c;
.end method

.method public abstract k(Lco/bird/android/model/VehicleDescriptor;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/VehicleDescriptor;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end method

.method public abstract l(Lco/bird/android/model/persistence/VehicleVersion;)Z
.end method

.method public abstract m()Lio/reactivex/c;
.end method

.method public abstract n()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "LXn1$a;",
            ">;"
        }
    .end annotation
.end method
