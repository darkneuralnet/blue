.class public final Lco/bird/android/widget/CountdownView$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/widget/CountdownView;->r(ILjava/util/concurrent/TimeUnit;Ljava/lang/Boolean;Lcom/uber/autodispose/ScopeProvider;Ljava/lang/Integer;Landroid/text/style/StyleSpan;Landroid/text/style/ForegroundColorSpan;Ljava/lang/Float;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Long;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Ljava/lang/Long;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/widget/CountdownView;

.field public final synthetic h:Ljava/util/concurrent/TimeUnit;

.field public final synthetic i:Ljava/lang/Integer;

.field public final synthetic j:Landroid/text/style/StyleSpan;

.field public final synthetic k:Landroid/text/style/ForegroundColorSpan;

.field public final synthetic l:Ljava/lang/Float;


# direct methods
.method public constructor <init>(Lco/bird/android/widget/CountdownView;Ljava/util/concurrent/TimeUnit;Ljava/lang/Integer;Landroid/text/style/StyleSpan;Landroid/text/style/ForegroundColorSpan;Ljava/lang/Float;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/widget/CountdownView$f;->g:Lco/bird/android/widget/CountdownView;

    iput-object p2, p0, Lco/bird/android/widget/CountdownView$f;->h:Ljava/util/concurrent/TimeUnit;

    iput-object p3, p0, Lco/bird/android/widget/CountdownView$f;->i:Ljava/lang/Integer;

    iput-object p4, p0, Lco/bird/android/widget/CountdownView$f;->j:Landroid/text/style/StyleSpan;

    iput-object p5, p0, Lco/bird/android/widget/CountdownView$f;->k:Landroid/text/style/ForegroundColorSpan;

    iput-object p6, p0, Lco/bird/android/widget/CountdownView$f;->l:Ljava/lang/Float;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Long;)V
    .locals 6

    iget-object v0, p0, Lco/bird/android/widget/CountdownView$f;->g:Lco/bird/android/widget/CountdownView;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object p1, p0, Lco/bird/android/widget/CountdownView$f;->h:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, v2, p1}, Lco/bird/android/widget/CountdownView;->access$maybeFormatTime(Lco/bird/android/widget/CountdownView;JLjava/util/concurrent/TimeUnit;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lco/bird/android/widget/CountdownView$f;->i:Ljava/lang/Integer;

    iget-object v3, p0, Lco/bird/android/widget/CountdownView$f;->j:Landroid/text/style/StyleSpan;

    iget-object v4, p0, Lco/bird/android/widget/CountdownView$f;->k:Landroid/text/style/ForegroundColorSpan;

    iget-object v5, p0, Lco/bird/android/widget/CountdownView$f;->l:Ljava/lang/Float;

    invoke-static/range {v0 .. v5}, Lco/bird/android/widget/CountdownView;->access$stylize(Lco/bird/android/widget/CountdownView;Ljava/lang/String;Ljava/lang/Integer;Landroid/text/style/StyleSpan;Landroid/text/style/ForegroundColorSpan;Ljava/lang/Float;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lco/bird/android/widget/CountdownView$f;->a(Ljava/lang/Long;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
