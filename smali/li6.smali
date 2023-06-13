.class public abstract Lli6;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lli6;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lli6;
    .locals 1

    sget-object v0, Lli6;->a:Lli6;

    if-nez v0, :cond_0

    new-instance v0, Lmi6;

    invoke-direct {v0}, Lmi6;-><init>()V

    sput-object v0, Lli6;->a:Lli6;

    :cond_0
    sget-object v0, Lli6;->a:Lli6;

    return-object v0
.end method
