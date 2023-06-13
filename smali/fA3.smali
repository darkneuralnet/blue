.class public abstract LfA3;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Landroid/net/Uri;)LfA3;
    .locals 1

    const-string v0, "OutputUri cannot be null."

    invoke-static {p0, v0}, LHZ3;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LSt;

    invoke-direct {v0, p0}, LSt;-><init>(Landroid/net/Uri;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Landroid/net/Uri;
.end method
