.class public abstract LAk2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LAk2$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<SerializationT::",
        "Lat5;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:LQ70;

.field public final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TSerializationT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LQ70;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LQ70;",
            "Ljava/lang/Class<",
            "TSerializationT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAk2;->a:LQ70;

    iput-object p2, p0, LAk2;->b:Ljava/lang/Class;

    return-void
.end method

.method public synthetic constructor <init>(LQ70;Ljava/lang/Class;LAk2$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LAk2;-><init>(LQ70;Ljava/lang/Class;)V

    return-void
.end method

.method public static a(LAk2$b;LQ70;Ljava/lang/Class;)LAk2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lat5;",
            ">(",
            "LAk2$b<",
            "TSerializationT;>;",
            "LQ70;",
            "Ljava/lang/Class<",
            "TSerializationT;>;)",
            "LAk2<",
            "TSerializationT;>;"
        }
    .end annotation

    new-instance v0, LAk2$a;

    invoke-direct {v0, p1, p2, p0}, LAk2$a;-><init>(LQ70;Ljava/lang/Class;LAk2$b;)V

    return-object v0
.end method


# virtual methods
.method public final b()LQ70;
    .locals 1

    iget-object v0, p0, LAk2;->a:LQ70;

    return-object v0
.end method

.method public final c()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TSerializationT;>;"
        }
    .end annotation

    iget-object v0, p0, LAk2;->b:Ljava/lang/Class;

    return-object v0
.end method

.method public abstract d(Lat5;LMq5;)Lbk2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TSerializationT;",
            "LMq5;",
            ")",
            "Lbk2;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation
.end method
