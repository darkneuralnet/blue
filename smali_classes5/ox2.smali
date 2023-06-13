.class public final Lox2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lox2$b;,
        Lox2$a;
    }
.end annotation


# static fields
.field public static final c:Lox2;


# instance fields
.field public final a:J

.field public final b:Lox2$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lox2$a;

    invoke-direct {v0}, Lox2$a;-><init>()V

    invoke-virtual {v0}, Lox2$a;->a()Lox2;

    move-result-object v0

    sput-object v0, Lox2;->c:Lox2;

    return-void
.end method

.method public constructor <init>(JLox2$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lox2;->a:J

    iput-object p3, p0, Lox2;->b:Lox2$b;

    return-void
.end method

.method public static c()Lox2$a;
    .locals 1

    new-instance v0, Lox2$a;

    invoke-direct {v0}, Lox2$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2
    .annotation build LK94;
        tag = 0x1
    .end annotation

    iget-wide v0, p0, Lox2;->a:J

    return-wide v0
.end method

.method public b()Lox2$b;
    .locals 1
    .annotation build LK94;
        tag = 0x3
    .end annotation

    iget-object v0, p0, Lox2;->b:Lox2$b;

    return-object v0
.end method
