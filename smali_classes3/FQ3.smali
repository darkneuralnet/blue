.class public final LFQ3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\t\u001a\u0004\u0008\u0003\u0010\n\u00a8\u0006\u000e"
    }
    d2 = {
        "LFQ3;",
        "",
        "Lco/bird/android/model/constant/Permission;",
        "a",
        "Lco/bird/android/model/constant/Permission;",
        "b",
        "()Lco/bird/android/model/constant/Permission;",
        "permission",
        "",
        "Z",
        "()Z",
        "granted",
        "<init>",
        "(Lco/bird/android/model/constant/Permission;Z)V",
        "permission_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lco/bird/android/model/constant/Permission;

.field public final b:Z


# direct methods
.method public constructor <init>(Lco/bird/android/model/constant/Permission;Z)V
    .locals 1

    const-string v0, "permission"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFQ3;->a:Lco/bird/android/model/constant/Permission;

    iput-boolean p2, p0, LFQ3;->b:Z

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, LFQ3;->b:Z

    return v0
.end method

.method public final b()Lco/bird/android/model/constant/Permission;
    .locals 1

    iget-object v0, p0, LFQ3;->a:Lco/bird/android/model/constant/Permission;

    return-object v0
.end method
