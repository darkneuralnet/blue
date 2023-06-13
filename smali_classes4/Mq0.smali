.class public abstract LMq0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\r\u0008\'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0016\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\'J\u0010\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0005H\'J$\u0010\r\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\nH\'J$\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\nH\'J\u001e\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000fH\'J\u0010\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u0002H\'J\u0018\u0010\u0014\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\nH\'J\u0018\u0010\u0016\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\nH\'J\u001e\u0010\u0018\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000fH\'J\u0008\u0010\u0019\u001a\u00020\u0008H\'\u00a8\u0006\u001c"
    }
    d2 = {
        "LMq0;",
        "",
        "",
        "complaintHash",
        "Lio/reactivex/p;",
        "Lco/bird/android/model/persistence/ComplaintResolution;",
        "b",
        "request",
        "Lio/reactivex/c;",
        "c",
        "",
        "url",
        "assetId",
        "g",
        "f",
        "",
        "issues",
        "h",
        "d",
        "action",
        "e",
        "notes",
        "i",
        "vehicleInvolvedIds",
        "j",
        "a",
        "<init>",
        "()V",
        "co.bird.android.lib.persistence.complaint-resolution.api"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Lio/reactivex/c;
.end method

.method public abstract b(I)Lio/reactivex/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lio/reactivex/p<",
            "Lco/bird/android/model/persistence/ComplaintResolution;",
            ">;"
        }
    .end annotation
.end method

.method public abstract c(Lco/bird/android/model/persistence/ComplaintResolution;)Lio/reactivex/c;
.end method

.method public abstract d(I)Lio/reactivex/c;
.end method

.method public abstract e(ILjava/lang/String;)Lio/reactivex/c;
.end method

.method public abstract f(ILjava/lang/String;Ljava/lang/String;)Lio/reactivex/c;
.end method

.method public abstract g(ILjava/lang/String;Ljava/lang/String;)Lio/reactivex/c;
.end method

.method public abstract h(ILjava/util/List;)Lio/reactivex/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation
.end method

.method public abstract i(ILjava/lang/String;)Lio/reactivex/c;
.end method

.method public abstract j(ILjava/util/List;)Lio/reactivex/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation
.end method
