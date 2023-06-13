.class public abstract LxA;
.super LXC;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\n"
    }
    d2 = {
        "LxA;",
        "LXC;",
        "Lco/bird/android/core/base/BaseCoreActivity;",
        "b",
        "Lco/bird/android/core/base/BaseCoreActivity;",
        "getActivity",
        "()Lco/bird/android/core/base/BaseCoreActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/core/base/BaseCoreActivity;)V",
        "core-basemvp_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Lco/bird/android/core/base/BaseCoreActivity;


# direct methods
.method public constructor <init>(Lco/bird/android/core/base/BaseCoreActivity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LXC;-><init>()V

    iput-object p1, p0, LxA;->b:Lco/bird/android/core/base/BaseCoreActivity;

    return-void
.end method


# virtual methods
.method public bridge synthetic getActivity()Landroidx/appcompat/app/AppCompatActivity;
    .locals 1

    invoke-virtual {p0}, LxA;->getActivity()Lco/bird/android/core/base/BaseCoreActivity;

    move-result-object v0

    return-object v0
.end method

.method public getActivity()Lco/bird/android/core/base/BaseCoreActivity;
    .locals 1

    iget-object v0, p0, LxA;->b:Lco/bird/android/core/base/BaseCoreActivity;

    return-object v0
.end method
