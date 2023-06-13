.class public Ltg5;
.super Lcp;
.source "SourceFile"


# instance fields
.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcp;-><init>(Z)V

    iput-object p2, p0, Ltg5;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ltg5;->c:Ljava/lang/String;

    return-object v0
.end method
