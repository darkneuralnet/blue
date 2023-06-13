.class public Lom4$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lom4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public final b:LIy;

.field public final c:LIy;

.field public final d:LIy;


# direct methods
.method public constructor <init>(LIy;LIy;LIy;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_2

    iput-object p1, p0, Lom4$a;->b:LIy;

    if-eqz p2, :cond_1

    iput-object p2, p0, Lom4$a;->c:LIy;

    if-eqz p3, :cond_0

    iput-object p3, p0, Lom4$a;->d:LIy;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The factor CRT coefficient must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The factor CRT exponent must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The prime factor must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Lom4$a;)LIy;
    .locals 0

    iget-object p0, p0, Lom4$a;->b:LIy;

    return-object p0
.end method

.method public static synthetic b(Lom4$a;)LIy;
    .locals 0

    iget-object p0, p0, Lom4$a;->c:LIy;

    return-object p0
.end method

.method public static synthetic c(Lom4$a;)LIy;
    .locals 0

    iget-object p0, p0, Lom4$a;->d:LIy;

    return-object p0
.end method
