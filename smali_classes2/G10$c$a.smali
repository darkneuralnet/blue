.class public LG10$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgd4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG10$c;->a(Ljava/lang/Exception;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/braintreepayments/api/exceptions/ConfigurationException;

.field public final synthetic b:LG10$c;


# direct methods
.method public constructor <init>(LG10$c;Lcom/braintreepayments/api/exceptions/ConfigurationException;)V
    .locals 0

    iput-object p1, p0, LG10$c$a;->b:LG10$c;

    iput-object p2, p0, LG10$c$a;->a:Lcom/braintreepayments/api/exceptions/ConfigurationException;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, LG10$c$a;->b:LG10$c;

    iget-object v0, v0, LG10$c;->a:LG10;

    invoke-static {v0}, LG10;->B9(LG10;)LN10;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public run()V
    .locals 2

    iget-object v0, p0, LG10$c$a;->b:LG10$c;

    iget-object v0, v0, LG10$c;->a:LG10;

    invoke-static {v0}, LG10;->B9(LG10;)LN10;

    move-result-object v0

    iget-object v1, p0, LG10$c$a;->a:Lcom/braintreepayments/api/exceptions/ConfigurationException;

    invoke-interface {v0, v1}, LN10;->onResponse(Ljava/lang/Object;)V

    return-void
.end method
