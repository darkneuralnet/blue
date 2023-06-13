.class public final LSN4$g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSN4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation


# instance fields
.field public final a:Ljava/lang/Throwable;

.field public final b:J


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSN4$g;->a:Ljava/lang/Throwable;

    iput-wide p2, p0, LSN4$g;->b:J

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, LSN4$g;->b:J

    return-wide v0
.end method

.method public b()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, LSN4$g;->a:Ljava/lang/Throwable;

    return-object v0
.end method
