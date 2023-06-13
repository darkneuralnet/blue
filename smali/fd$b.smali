.class public final Lfd$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LzO2;",
        "LvO2;",
        "Lkz0;",
        "LyO2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "LzO2;",
        "LvO2;",
        "measurable",
        "Lkz0;",
        "constraints",
        "LyO2;",
        "a",
        "(LzO2;LvO2;J)LyO2;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAndroidOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,589:1\n92#2:590\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2\n*L\n579#1:590\n*E\n"
    }
.end annotation


# static fields
.field public static final g:Lfd$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfd$b;

    invoke-direct {v0}, Lfd$b;-><init>()V

    sput-object v0, Lfd$b;->g:Lfd$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LzO2;LvO2;J)LyO2;
    .locals 7

    const-string v0, "$this$layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p3, p4}, LvO2;->P0(J)LOU3;

    move-result-object p2

    invoke-static {}, LSk0;->b()F

    move-result p3

    const/4 p4, 0x2

    int-to-float p4, p4

    mul-float/2addr p3, p4

    invoke-static {p3}, Lk61;->g(F)F

    move-result p3

    invoke-interface {p1, p3}, Lg01;->F0(F)I

    move-result p3

    invoke-virtual {p2}, LOU3;->i1()I

    move-result p4

    add-int v1, p4, p3

    invoke-virtual {p2}, LOU3;->d1()I

    move-result p4

    add-int v2, p4, p3

    const/4 v3, 0x0

    new-instance v4, Lfd$b$a;

    invoke-direct {v4, p2, p3}, Lfd$b$a;-><init>(LOU3;I)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, LzO2;->Y(LzO2;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LyO2;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LzO2;

    check-cast p2, LvO2;

    check-cast p3, Lkz0;

    invoke-virtual {p3}, Lkz0;->s()J

    move-result-wide v0

    invoke-virtual {p0, p1, p2, v0, v1}, Lfd$b;->a(LzO2;LvO2;J)LyO2;

    move-result-object p1

    return-object p1
.end method
