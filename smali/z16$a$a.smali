.class public final Lz16$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


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
        "Lkotlin/jvm/functions/Function0<",
        "LCe3;",
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
.field public final synthetic g:Lx16;

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
.method public constructor <init>(Lx16;LEX2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx16;",
            "LEX2<",
            "LG52;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lz16$a$a;->g:Lx16;

    iput-object p2, p0, Lz16$a$a;->h:LEX2;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()J
    .locals 3

    iget-object v0, p0, Lz16$a$a;->g:Lx16;

    iget-object v1, p0, Lz16$a$a;->h:LEX2;

    invoke-static {v1}, Lz16$a;->a(LEX2;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Ly16;->b(Lx16;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lz16$a$a;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, LCe3;->d(J)LCe3;

    move-result-object v0

    return-object v0
.end method
