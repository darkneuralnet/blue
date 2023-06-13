.class public final Lox2$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lox2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:J

.field public b:Lox2$b;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lox2$a;->a:J

    sget-object v0, Lox2$b;->c:Lox2$b;

    iput-object v0, p0, Lox2$a;->b:Lox2$b;

    return-void
.end method


# virtual methods
.method public a()Lox2;
    .locals 4

    new-instance v0, Lox2;

    iget-wide v1, p0, Lox2$a;->a:J

    iget-object v3, p0, Lox2$a;->b:Lox2$b;

    invoke-direct {v0, v1, v2, v3}, Lox2;-><init>(JLox2$b;)V

    return-object v0
.end method

.method public b(J)Lox2$a;
    .locals 0

    iput-wide p1, p0, Lox2$a;->a:J

    return-object p0
.end method

.method public c(Lox2$b;)Lox2$a;
    .locals 0

    iput-object p1, p0, Lox2$a;->b:Lox2$b;

    return-object p0
.end method
