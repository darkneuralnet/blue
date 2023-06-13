.class public LCY0;
.super Lm1;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lm1;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    const/16 v0, 0xa

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Default"

    return-object v0
.end method
