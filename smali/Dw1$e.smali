.class public final LDw1$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDw1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDw1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field public final a:Lzw1;

.field public final b:I

.field public final c:I

.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lzw1;IILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDw1$e;->a:Lzw1;

    iput p2, p0, LDw1$e;->c:I

    iput p3, p0, LDw1$e;->b:I

    iput-object p4, p0, LDw1$e;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, LDw1$e;->c:I

    return v0
.end method

.method public b()Lzw1;
    .locals 1

    iget-object v0, p0, LDw1$e;->a:Lzw1;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LDw1$e;->d:Ljava/lang/String;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, LDw1$e;->b:I

    return v0
.end method
