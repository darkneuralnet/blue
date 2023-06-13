.class public final LgX8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LLW8;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LQY8;

    const-string v1, "SHA-256"

    const-string v2, "Hashing.sha256()"

    invoke-direct {v0, v1, v2}, LQY8;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, LgX8;->a:LLW8;

    return-void
.end method
