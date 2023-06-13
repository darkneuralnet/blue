.class public final LCF2$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCF2;->G()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lio/reactivex/K<",
        "+",
        "Lkotlin/Triple<",
        "+",
        "Ljava/lang/String;",
        "+",
        "LFQ3;",
        "+",
        "Ljava/lang/Boolean;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0010\t\u001ar\u00122\u0008\u0001\u0012.\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0006*8\u00122\u0008\u0001\u0012.\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "",
        "email",
        "Lio/reactivex/K;",
        "Lkotlin/Triple;",
        "LFQ3;",
        "",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/String;)Lio/reactivex/K;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LCF2;


# direct methods
.method public constructor <init>(LCF2;)V
    .locals 0

    iput-object p1, p0, LCF2$g;->g:LCF2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Triple;
    .locals 0

    invoke-static {p0, p1}, LCF2$g;->b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Triple;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Triple;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Triple;

    return-object p0
.end method


# virtual methods
.method public final invoke(Ljava/lang/String;)Lio/reactivex/K;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lkotlin/Triple<",
            "Ljava/lang/String;",
            "LFQ3;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    const-string v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LCF2$g;->g:LCF2;

    invoke-static {v0}, LCF2;->access$getPermissionManager$p(LCF2;)LDQ3;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/Permission;->ACCESS_FINE_LOCATION:Lco/bird/android/model/constant/Permission;

    invoke-virtual {v0, v1}, LDQ3;->l(Lco/bird/android/model/constant/Permission;)Lio/reactivex/F;

    move-result-object v0

    iget-object v1, p0, LCF2$g;->g:LCF2;

    invoke-static {v1}, LCF2;->access$getUi$p(LCF2;)LKF2;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, LsD;->progress$default(Lio/reactivex/F;LS74;IILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LCF2$g$a;

    iget-object v2, p0, LCF2$g;->g:LCF2;

    invoke-direct {v1, p1, v2}, LCF2$g$a;-><init>(Ljava/lang/String;LCF2;)V

    new-instance p1, LDF2;

    invoke-direct {p1, v1}, LDF2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, LCF2$g;->invoke(Ljava/lang/String;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
