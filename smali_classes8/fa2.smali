.class public interface abstract Lfa2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LN;

.field public static final b:LN;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LN;

    const-string v1, "0.4.0.127.0.15.1.1.13.0"

    invoke-direct {v0, v1}, LN;-><init>(Ljava/lang/String;)V

    sput-object v0, Lfa2;->a:LN;

    new-instance v0, LN;

    const-string v1, "0.4.0.127.0.15.1.1.14.0"

    invoke-direct {v0, v1}, LN;-><init>(Ljava/lang/String;)V

    sput-object v0, Lfa2;->b:LN;

    return-void
.end method
