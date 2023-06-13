.class public LG10$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCx0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG10;->Ea(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lja;

.field public final synthetic c:LG10;


# direct methods
.method public constructor <init>(LG10;Lja;)V
    .locals 0

    iput-object p1, p0, LG10$e;->c:LG10;

    iput-object p2, p0, LG10$e;->b:Lja;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public k(Lex0;)V
    .locals 1

    invoke-virtual {p1}, Lex0;->b()Laa;

    move-result-object p1

    invoke-virtual {p1}, Laa;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LG10$e;->c:LG10;

    invoke-static {p1}, LG10;->t8(LG10;)Lfa;

    move-result-object p1

    iget-object v0, p0, LG10$e;->b:Lja;

    invoke-virtual {p1, v0}, Lfa;->a(Lja;)V

    :cond_0
    return-void
.end method
