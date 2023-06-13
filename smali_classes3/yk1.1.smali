.class public Lyk1;
.super LHA;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0016\u0018\u00002\u00020\u0001B)\u0008\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0014X\u0094\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0010"
    }
    d2 = {
        "Lyk1;",
        "LHA;",
        "LTo2;",
        "j",
        "LTo2;",
        "Vl",
        "()LTo2;",
        "assetManager",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "LJf;",
        "adapter",
        "Lbg;",
        "converter",
        "<init>",
        "(LTo2;Lco/bird/android/core/mvp/BaseActivity;LJf;Lbg;)V",
        "announcement_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final j:LTo2;


# direct methods
.method public constructor <init>(LTo2;Lco/bird/android/core/mvp/BaseActivity;LJf;Lbg;)V
    .locals 1

    const-string v0, "assetManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adapter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "converter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p3, p4}, LHA;-><init>(Lco/bird/android/core/mvp/BaseActivity;LJf;Lbg;)V

    iput-object p1, p0, Lyk1;->j:LTo2;

    return-void
.end method


# virtual methods
.method public Vl()LTo2;
    .locals 1

    iget-object v0, p0, Lyk1;->j:LTo2;

    return-object v0
.end method
