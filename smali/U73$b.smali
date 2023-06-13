.class public LU73$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU73;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/android/volley/VolleyError;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/android/volley/VolleyError;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU73$b;->a:Ljava/lang/String;

    iput-object p2, p0, LU73$b;->b:Lcom/android/volley/VolleyError;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/android/volley/VolleyError;LU73$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LU73$b;-><init>(Ljava/lang/String;Lcom/android/volley/VolleyError;)V

    return-void
.end method

.method public static synthetic a(LU73$b;)Lcom/android/volley/VolleyError;
    .locals 0

    iget-object p0, p0, LU73$b;->b:Lcom/android/volley/VolleyError;

    return-object p0
.end method

.method public static synthetic b(LU73$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LU73$b;->a:Ljava/lang/String;

    return-object p0
.end method
