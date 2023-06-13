.class public final Lqh5$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luj1$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqh5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final b:Ljava/security/MessageDigest;

.field public final c:LLP5;


# direct methods
.method public constructor <init>(Ljava/security/MessageDigest;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LLP5;->a()LLP5;

    move-result-object v0

    iput-object v0, p0, Lqh5$b;->c:LLP5;

    iput-object p1, p0, Lqh5$b;->b:Ljava/security/MessageDigest;

    return-void
.end method


# virtual methods
.method public e()LLP5;
    .locals 1

    iget-object v0, p0, Lqh5$b;->c:LLP5;

    return-object v0
.end method
