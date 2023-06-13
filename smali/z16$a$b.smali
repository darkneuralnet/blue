.class public final Lz16$a$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz16$a;->c(LgV2;LEt0;I)LgV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/jvm/functions/Function0<",
        "+",
        "LCe3;",
        ">;",
        "LgV2;",
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

    iput-object p1, p0, Lz16$a$b;->g:Lg01;

    iput-object p2, p0, Lz16$a$b;->h:LEX2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/jvm/functions/Function0;)LgV2;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "LCe3;",
            ">;)",
            "LgV2;"
        }
    .end annotation

    const-string v0, "center"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LgV2;->b0:LgV2$a;

    sget-object v0, LaG2;->g:LaG2$a;

    invoke-virtual {v0}, LaG2$a;->b()LaG2;

    move-result-object v5

    new-instance v2, Lz16$a$b$a;

    invoke-direct {v2, p1}, Lz16$a$b$a;-><init>(Lkotlin/jvm/functions/Function0;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v6, Lz16$a$b$b;

    iget-object p1, p0, Lz16$a$b;->g:Lg01;

    iget-object v0, p0, Lz16$a$b;->h:LEX2;

    invoke-direct {v6, p1, v0}, Lz16$a$b$b;-><init>(Lg01;LEX2;)V

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, LZF2;->f(LgV2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FLaG2;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LgV2;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/jvm/functions/Function0;

    invoke-virtual {p0, p1}, Lz16$a$b;->a(Lkotlin/jvm/functions/Function0;)LgV2;

    move-result-object p1

    return-object p1
.end method
