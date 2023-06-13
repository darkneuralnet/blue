.class public final LDx0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHN1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDx0;->d(LG10;LCx0;LN10;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field public final synthetic a:LG10;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:LCx0;

.field public final synthetic d:LN10;


# direct methods
.method public constructor <init>(LG10;Ljava/lang/String;LCx0;LN10;)V
    .locals 0

    iput-object p1, p0, LDx0$a;->a:LG10;

    iput-object p2, p0, LDx0$a;->b:Ljava/lang/String;

    iput-object p3, p0, LDx0$a;->c:LCx0;

    iput-object p4, p0, LDx0$a;->d:LN10;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Exception;)V
    .locals 1

    const/4 v0, 0x0

    sput-boolean v0, LDx0;->b:Z

    iget-object v0, p0, LDx0$a;->d:LN10;

    invoke-interface {v0, p1}, LN10;->onResponse(Ljava/lang/Object;)V

    return-void
.end method

.method public success(Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p1}, Lex0;->a(Ljava/lang/String;)Lex0;

    move-result-object p1

    iget-object v1, p0, LDx0$a;->a:LG10;

    invoke-virtual {v1}, LG10;->T9()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, LDx0$a;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LDx0$a;->a:LG10;

    invoke-virtual {v3}, LG10;->da()Lcom/braintreepayments/api/models/Authorization;

    move-result-object v3

    invoke-virtual {v3}, Lcom/braintreepayments/api/models/Authorization;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, p1}, LDx0;->a(Landroid/content/Context;Ljava/lang/String;Lex0;)V

    sput-boolean v0, LDx0;->b:Z

    iget-object v1, p0, LDx0$a;->c:LCx0;

    invoke-interface {v1, p1}, LCx0;->k(Lex0;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sput-boolean v0, LDx0;->b:Z

    iget-object v0, p0, LDx0$a;->d:LN10;

    invoke-interface {v0, p1}, LN10;->onResponse(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
