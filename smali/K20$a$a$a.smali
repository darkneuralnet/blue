.class public final synthetic LK20$a$a$a;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK20$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "Lkotlin/jvm/functions/Function0<",
        "LOs4;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic b:LK20;

.field public final synthetic c:Lnm2;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "LOs4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LK20;Lnm2;Lkotlin/jvm/functions/Function0;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LK20;",
            "Lnm2;",
            "Lkotlin/jvm/functions/Function0<",
            "LOs4;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LK20$a$a$a;->b:LK20;

    iput-object p2, p0, LK20$a$a$a;->c:Lnm2;

    iput-object p3, p0, LK20$a$a$a;->d:Lkotlin/jvm/functions/Function0;

    const/4 v1, 0x0

    const-class v2, Lkotlin/jvm/internal/Intrinsics$Kotlin;

    const-string v3, "localRect"

    const-string v4, "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderModifier;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;"

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a()LOs4;
    .locals 3

    iget-object v0, p0, LK20$a$a$a;->b:LK20;

    iget-object v1, p0, LK20$a$a$a;->c:Lnm2;

    iget-object v2, p0, LK20$a$a$a;->d:Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1, v2}, LK20;->h(LK20;Lnm2;Lkotlin/jvm/functions/Function0;)LOs4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LK20$a$a$a;->a()LOs4;

    move-result-object v0

    return-object v0
.end method
