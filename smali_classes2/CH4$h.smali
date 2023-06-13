.class public final LCH4$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCH4;->G()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Unit;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LCH4;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(LCH4;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LCH4$h;->g:LCH4;

    iput-object p2, p0, LCH4$h;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LCH4$h;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 2

    iget-object p1, p0, LCH4$h;->g:LCH4;

    invoke-static {p1}, LCH4;->access$getSections$p(LCH4;)Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "sections"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-static {p1, v0}, LCH4;->access$isSingleSelect(LCH4;Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LCH4$h;->g:LCH4;

    invoke-static {p1}, LCH4;->access$getSelectedOptions$p(LCH4;)Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, LCH4$h;->h:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, LCH4;->U(Ljava/util/Set;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, LCH4$h;->g:LCH4;

    invoke-static {p1}, LCH4;->access$getSelectedOptions$p(LCH4;)Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, LCH4$h;->h:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, LCH4;->R(Ljava/util/Set;Ljava/lang/String;)V

    :goto_0
    return-void
.end method
