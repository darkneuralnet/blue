.class public LUj2$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUj2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:LSj2;

.field public b:Z


# direct methods
.method public constructor <init>(LSj2;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUj2$b;->a:LSj2;

    iput-boolean p2, p0, LUj2$b;->b:Z

    return-void
.end method


# virtual methods
.method public a()LSj2;
    .locals 1

    iget-object v0, p0, LUj2$b;->a:LSj2;

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, LUj2$b;->b:Z

    return v0
.end method
