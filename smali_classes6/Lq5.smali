.class public final LLq5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LQ70;


# direct methods
.method public constructor <init>(LQ70;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLq5;->a:LQ70;

    return-void
.end method

.method public static a([BLMq5;)LLq5;
    .locals 0

    if-eqz p1, :cond_0

    new-instance p1, LLq5;

    invoke-static {p0}, LQ70;->a([B)LQ70;

    move-result-object p0

    invoke-direct {p1, p0}, LLq5;-><init>(LQ70;)V

    return-object p1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "SecretKeyAccess required"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget-object v0, p0, LLq5;->a:LQ70;

    invoke-virtual {v0}, LQ70;->c()I

    move-result v0

    return v0
.end method
