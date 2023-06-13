.class public final Lu56$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCx0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu56;->c(LG10;LrN3;LLN3;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field public final synthetic b:LrN3;

.field public final synthetic c:LG10;

.field public final synthetic d:LLN3;


# direct methods
.method public constructor <init>(LrN3;LG10;LLN3;)V
    .locals 0

    iput-object p1, p0, Lu56$a;->b:LrN3;

    iput-object p2, p0, Lu56$a;->c:LG10;

    iput-object p3, p0, Lu56$a;->d:LLN3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public k(Lex0;)V
    .locals 2

    iget-object v0, p0, Lu56$a;->b:LrN3;

    instance-of v0, v0, Lcom/braintreepayments/api/models/CardBuilder;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lex0;->d()LTD1;

    move-result-object p1

    const-string v0, "tokenize_credit_cards"

    invoke-virtual {p1, v0}, LTD1;->d(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lu56$a;->c:LG10;

    iget-object v0, p0, Lu56$a;->b:LrN3;

    check-cast v0, Lcom/braintreepayments/api/models/CardBuilder;

    iget-object v1, p0, Lu56$a;->d:LLN3;

    invoke-static {p1, v0, v1}, Lu56;->a(LG10;Lcom/braintreepayments/api/models/CardBuilder;LLN3;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lu56$a;->c:LG10;

    iget-object v0, p0, Lu56$a;->b:LrN3;

    iget-object v1, p0, Lu56$a;->d:LLN3;

    invoke-static {p1, v0, v1}, Lu56;->b(LG10;LrN3;LLN3;)V

    :goto_0
    return-void
.end method
