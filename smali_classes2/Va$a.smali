.class public final LVa$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHN1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LVa;->d(Landroid/content/Context;Lcom/braintreepayments/api/models/Authorization;LK10;Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lfa;

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public constructor <init>(Lfa;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, LVa$a;->a:Lfa;

    iput-object p2, p0, LVa$a;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Exception;)V
    .locals 0

    return-void
.end method

.method public success(Ljava/lang/String;)V
    .locals 1

    iget-object p1, p0, LVa$a;->a:Lfa;

    iget-object v0, p0, LVa$a;->b:Ljava/util/List;

    invoke-virtual {p1, v0}, Lfa;->f(Ljava/util/List;)V

    return-void
.end method
