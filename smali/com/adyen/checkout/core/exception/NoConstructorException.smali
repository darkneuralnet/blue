.class public Lcom/adyen/checkout/core/exception/NoConstructorException;
.super Ljava/lang/IllegalStateException;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = -0x4bc7dcc0750f4b8bL


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "No instances allowed."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    return-void
.end method
