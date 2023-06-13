.class public final LOm2$b$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOm2$b;->S()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
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
.field public final synthetic g:LOm2;

.field public final synthetic h:LOm2$b;

.field public final synthetic i:LJm2;


# direct methods
.method public constructor <init>(LOm2;LOm2$b;LJm2;)V
    .locals 0

    iput-object p1, p0, LOm2$b$c;->g:LOm2;

    iput-object p2, p0, LOm2$b$c;->h:LOm2$b;

    iput-object p3, p0, LOm2$b$c;->i:LJm2;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LOm2$b$c;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    iget-object v0, p0, LOm2$b$c;->g:LOm2;

    invoke-static {v0}, LOm2;->a(LOm2;)LJm2;

    move-result-object v0

    invoke-virtual {v0}, LJm2;->z()V

    iget-object v0, p0, LOm2$b$c;->h:LOm2$b;

    sget-object v1, LOm2$b$c$a;->g:LOm2$b$c$a;

    invoke-virtual {v0, v1}, LOm2$b;->Y0(Lkotlin/jvm/functions/Function1;)V

    iget-object v0, p0, LOm2$b$c;->i:LJm2;

    invoke-virtual {v0}, LJm2;->S()LH83;

    move-result-object v0

    invoke-virtual {v0}, LH83;->s1()LyO2;

    move-result-object v0

    invoke-interface {v0}, LyO2;->c()V

    iget-object v0, p0, LOm2$b$c;->g:LOm2;

    invoke-static {v0}, LOm2;->a(LOm2;)LJm2;

    move-result-object v0

    invoke-virtual {v0}, LJm2;->y()V

    iget-object v0, p0, LOm2$b$c;->h:LOm2$b;

    sget-object v1, LOm2$b$c$b;->g:LOm2$b$c$b;

    invoke-virtual {v0, v1}, LOm2$b;->Y0(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
