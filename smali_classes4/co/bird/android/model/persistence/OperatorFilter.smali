.class public interface abstract Lco/bird/android/model/persistence/OperatorFilter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u0082\u0001\u0002\u0012\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lco/bird/android/model/persistence/OperatorFilter;",
        "",
        "id",
        "",
        "getId",
        "()Ljava/lang/String;",
        "kind",
        "Lco/bird/android/model/constant/OperatorMapKind;",
        "getKind",
        "()Lco/bird/android/model/constant/OperatorMapKind;",
        "ordinal",
        "",
        "getOrdinal",
        "()I",
        "type",
        "Lco/bird/android/model/constant/OperatorFilterType;",
        "getType",
        "()Lco/bird/android/model/constant/OperatorFilterType;",
        "Lco/bird/android/model/persistence/OperatorOptionFilter;",
        "Lco/bird/android/model/persistence/OperatorToggleFilter;",
        "model-persistence_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract getId()Ljava/lang/String;
.end method

.method public abstract getKind()Lco/bird/android/model/constant/OperatorMapKind;
.end method

.method public abstract getOrdinal()I
.end method

.method public abstract getType()Lco/bird/android/model/constant/OperatorFilterType;
.end method
