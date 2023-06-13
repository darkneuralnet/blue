.class public LHv;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LMv;

.field public static final b:LOv;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LMv;

    invoke-direct {v0}, LMv;-><init>()V

    sput-object v0, LHv;->a:LMv;

    new-instance v0, LOv;

    invoke-direct {v0}, LOv;-><init>()V

    sput-object v0, LHv;->b:LOv;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LF;)LMv;
    .locals 2

    invoke-virtual {p0}, LF;->f()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    sget-object p0, LHv;->a:LMv;

    return-object p0

    :cond_0
    new-instance v0, LMv;

    invoke-direct {v0, p0}, LMv;-><init>(LF;)V

    return-object v0
.end method
