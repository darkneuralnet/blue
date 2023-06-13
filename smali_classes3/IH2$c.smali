.class public final LIH2$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIH2;-><init>(Lcom/uber/autodispose/ScopeProvider;LMH2;LrH2;LYR4;LWg6;LpU4;LoF3;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "La94<",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/SelectedRideButton;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "La94;",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/SelectedRideButton;",
        "b",
        "()La94;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LIH2$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LIH2$c;

    invoke-direct {v0}, LIH2$c;-><init>()V

    sput-object v0, LIH2$c;->g:LIH2$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()La94;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La94<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/SelectedRideButton;",
            ">;>;"
        }
    .end annotation

    sget-object v0, La94;->h:La94$a;

    sget-object v1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LIH2$c;->b()La94;

    move-result-object v0

    return-object v0
.end method
