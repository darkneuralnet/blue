.class public Lpz0$o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LId3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpz0;->b(LFb6;)LId3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LId3<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lpz0;


# direct methods
.method public constructor <init>(Lpz0;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lpz0$o;->b:Lpz0;

    iput-object p2, p0, Lpz0$o;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    new-instance v0, Lcom/google/gson/JsonIOException;

    iget-object v1, p0, Lpz0$o;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
