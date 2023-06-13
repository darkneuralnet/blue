.class public interface abstract annotation LK94;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation LK94;
        intEncoding = .enum LK94$a;->b:LK94$a;
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK94$a;
    }
.end annotation


# virtual methods
.method public abstract intEncoding()LK94$a;
.end method

.method public abstract tag()I
.end method
