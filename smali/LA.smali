.class public abstract LLA;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJN1;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(LmI4;Ljava/util/Map;)LGN1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LmI4<",
            "*>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "LGN1;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/android/volley/AuthFailureError;
        }
    .end annotation
.end method
