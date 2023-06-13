.class public final LdZ$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LdZ;->h(LgV2;FLa30;Lhy5;)LgV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LS42;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LS42;",
        "",
        "a",
        "(LS42;)V"
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
        "SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Border.kt\nandroidx/compose/foundation/BorderKt\n*L\n1#1,170:1\n150#2,10:171\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:F

.field public final synthetic h:La30;

.field public final synthetic i:Lhy5;


# direct methods
.method public constructor <init>(FLa30;Lhy5;)V
    .locals 0

    iput p1, p0, LdZ$b;->g:F

    iput-object p2, p0, LdZ$b;->h:La30;

    iput-object p3, p0, LdZ$b;->i:Lhy5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LS42;)V
    .locals 3

    const-string v0, "$this$null"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "border"

    invoke-virtual {p1, v0}, LS42;->b(Ljava/lang/String;)V

    invoke-virtual {p1}, LS42;->a()LGj6;

    move-result-object v0

    iget v1, p0, LdZ$b;->g:F

    invoke-static {v1}, Lk61;->d(F)Lk61;

    move-result-object v1

    const-string v2, "width"

    invoke-virtual {v0, v2, v1}, LGj6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, LdZ$b;->h:La30;

    instance-of v0, v0, LpN5;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LS42;->a()LGj6;

    move-result-object v0

    iget-object v1, p0, LdZ$b;->h:La30;

    check-cast v1, LpN5;

    invoke-virtual {v1}, LpN5;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Lpm0;->i(J)Lpm0;

    move-result-object v1

    const-string v2, "color"

    invoke-virtual {v0, v2, v1}, LGj6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, LdZ$b;->h:La30;

    check-cast v0, LpN5;

    invoke-virtual {v0}, LpN5;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Lpm0;->i(J)Lpm0;

    move-result-object v0

    invoke-virtual {p1, v0}, LS42;->c(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LS42;->a()LGj6;

    move-result-object v0

    const-string v1, "brush"

    iget-object v2, p0, LdZ$b;->h:La30;

    invoke-virtual {v0, v1, v2}, LGj6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p1}, LS42;->a()LGj6;

    move-result-object p1

    const-string v0, "shape"

    iget-object v1, p0, LdZ$b;->i:Lhy5;

    invoke-virtual {p1, v0, v1}, LGj6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LS42;

    invoke-virtual {p0, p1}, LdZ$b;->a(LS42;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
