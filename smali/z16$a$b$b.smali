.class public final Lz16$a$b$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz16$a$b;->a(Lkotlin/jvm/functions/Function0;)LgV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lo61;",
        "Lkotlin/Unit;",
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
.field public final synthetic g:Lg01;

.field public final synthetic h:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "LG52;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lg01;LEX2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg01;",
            "LEX2<",
            "LG52;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lz16$a$b$b;->g:Lg01;

    iput-object p2, p0, Lz16$a$b$b;->h:LEX2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 3

    iget-object v0, p0, Lz16$a$b$b;->h:LEX2;

    iget-object v1, p0, Lz16$a$b$b;->g:Lg01;

    invoke-static {p1, p2}, Lo61;->h(J)F

    move-result v2

    invoke-interface {v1, v2}, Lg01;->F0(F)I

    move-result v2

    invoke-static {p1, p2}, Lo61;->g(J)F

    move-result p1

    invoke-interface {v1, p1}, Lg01;->F0(F)I

    move-result p1

    invoke-static {v2, p1}, LH52;->a(II)J

    move-result-wide p1

    invoke-static {v0, p1, p2}, Lz16$a;->b(LEX2;J)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lo61;

    invoke-virtual {p1}, Lo61;->k()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lz16$a$b$b;->a(J)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
