.class public final Lip0$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lip0;->a(Lco/bird/android/model/persistence/Bird;ZZ)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/Vehicle;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/Vehicle;",
        "it",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/Vehicle;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lip0;

.field public final synthetic h:Lco/bird/android/model/persistence/Bird;

.field public final synthetic i:Z


# direct methods
.method public constructor <init>(Lip0;Lco/bird/android/model/persistence/Bird;Z)V
    .locals 0

    iput-object p1, p0, Lip0$b;->g:Lip0;

    iput-object p2, p0, Lip0$b;->h:Lco/bird/android/model/persistence/Bird;

    iput-boolean p3, p0, Lip0$b;->i:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/Vehicle;)Lio/reactivex/h;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lip0$b;->g:Lip0;

    iget-object v0, p0, Lip0$b;->h:Lco/bird/android/model/persistence/Bird;

    iget-boolean v1, p0, Lip0$b;->i:Z

    invoke-static {p1, v0, v1}, Lip0;->access$forceUpdateBird(Lip0;Lco/bird/android/model/persistence/Bird;Z)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/Vehicle;

    invoke-virtual {p0, p1}, Lip0$b;->a(Lco/bird/android/model/Vehicle;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method